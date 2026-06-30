package df2;

/* loaded from: classes10.dex */
public final class us implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231553d;

    public us(df2.lt ltVar) {
        this.f231553d = ltVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.lt ltVar = this.f231553d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = ltVar.f230707o;
        if (wxRecyclerAdapter != null) {
            int i17 = ltVar.f230712t;
            java.lang.String str = df2.lt.W;
            wxRecyclerAdapter.notifyItemChanged(i17, "bannerselected");
        }
    }
}
