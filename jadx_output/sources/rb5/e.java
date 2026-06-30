package rb5;

/* loaded from: classes11.dex */
public class e implements com.tencent.mm.ui.tools.od {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb5.f f393866a;

    public e(rb5.f fVar) {
        this.f393866a = fVar;
    }

    @Override // com.tencent.mm.ui.tools.od
    public void a() {
        com.tencent.mars.xlog.Log.i("ChattingCompat", "[onDrawed]");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rb5.f fVar = this.f393866a;
        fVar.f393867a = currentTimeMillis;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = fVar.f393868b.f393882f;
        if (chattingUIFragment == null) {
            com.tencent.mars.xlog.Log.e("ChattingCompat", "chattingFragmet is null!");
            return;
        }
        if (chattingUIFragment.getSwipeBackLayout() != null) {
            fVar.f393868b.f393882f.getSwipeBackLayout().startAnimation(fVar.f393868b.f393884h);
        } else {
            fVar.f393868b.f393882f.getView().startAnimation(fVar.f393868b.f393884h);
        }
        fVar.f393868b.f393885i.setOndispatchDraw(null);
    }
}
