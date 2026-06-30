package t13;

/* loaded from: classes12.dex */
public abstract class a implements t13.h {
    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        t13.h hVar = (t13.h) obj;
        if (getPriority() < hVar.getPriority()) {
            return -1;
        }
        return getPriority() > hVar.getPriority() ? 1 : 0;
    }
}
