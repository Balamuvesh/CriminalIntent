import androidx.lifecycle.ViewModel
import com.example.criminalintent.Crime

class CrimeListViewModel : ViewModel() {
    var crimes = mutableListOf<Crime>()

    init {
        for (i in 0..100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 3 == 0
            crimes.add(i, crime)

        }
    }
}