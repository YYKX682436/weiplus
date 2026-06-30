package di3;

/* loaded from: classes10.dex */
public class q implements java.util.Comparator {
    public q(di3.p pVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        android.util.Size size = (android.util.Size) obj;
        android.util.Size size2 = (android.util.Size) obj2;
        int height = size.getHeight() * size.getWidth();
        int height2 = size2.getHeight() * size2.getWidth();
        if (height2 < height) {
            return -1;
        }
        return height2 > height ? 1 : 0;
    }
}
