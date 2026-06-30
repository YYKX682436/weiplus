package vh;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh.y f436824d;

    public w(vh.y yVar) {
        this.f436824d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vh.y yVar = this.f436824d;
        int size = ((java.util.ArrayList) yVar.f436825a.f436819d).size();
        ((java.util.ArrayList) yVar.f436825a.f436819d).clear();
        yVar.f436825a.notifyItemRangeRemoved(0, size);
    }
}
