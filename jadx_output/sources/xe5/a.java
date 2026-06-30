package xe5;

/* loaded from: classes3.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f453975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe5.f f453976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f453977f;

    public a(boolean z17, xe5.f fVar, java.util.Map map, java.lang.String str) {
        this.f453975d = z17;
        this.f453976e = fVar;
        this.f453977f = map;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        boolean z17 = this.f453975d;
        java.util.Map map = this.f453977f;
        xe5.f fVar = this.f453976e;
        if (z17) {
            fVar.getClass();
            g4Var.add(0, 3, 0, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.axa, map.get(".msg.appmsg.extinfo.notifymsg.title.nickname")));
        } else {
            fVar.getClass();
            g4Var.d(2, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478532ac), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ax_, map.get(".msg.appmsg.extinfo.notifymsg.title.nickname")));
        }
        fVar.getClass();
        g4Var.add(0, 1, 0, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.hcr));
    }
}
