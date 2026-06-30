package vh;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f436822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh.y f436823e;

    public v(vh.y yVar, java.util.List list) {
        this.f436823e = yVar;
        this.f436822d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        vh.y yVar = this.f436823e;
        int size = ((java.util.ArrayList) yVar.f436825a.f436819d).size() - 1;
        java.util.List list = this.f436822d;
        int size2 = list.size();
        ((java.util.ArrayList) yVar.f436825a.f436819d).addAll(list);
        yVar.f436825a.notifyItemRangeChanged(java.lang.Math.max(size, 0), size2);
    }
}
