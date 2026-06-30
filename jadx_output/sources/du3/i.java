package du3;

/* loaded from: classes10.dex */
public final class i implements wu3.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.m f243616a;

    public i(du3.m mVar) {
        this.f243616a = mVar;
    }

    @Override // wu3.a1
    public void a(java.lang.CharSequence charSequence, int i17, int i18, java.lang.String font) {
        kotlin.jvm.internal.o.g(font, "font");
        du3.m mVar = this.f243616a;
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                if (mVar.f243651g.getMode() == 0) {
                    boolean z17 = mVar.f243652h;
                    jz5.g gVar = mVar.f243657p;
                    if (!z17) {
                        ((hk0.u0) ((jz5.n) gVar).getValue()).Q6(hk0.p.f281786d, charSequence.toString(), i17, i18, font);
                    } else if (kotlin.jvm.internal.o.b(mVar.f243653i, charSequence) && kotlin.jvm.internal.o.b(mVar.f243656o, font) && mVar.f243654m == i17 && mVar.f243655n == i18) {
                        int i19 = rl.b.f397143a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAddTextPlugin", "changeText but no edit change", null);
                    } else {
                        int i27 = rl.b.f397143a;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoAddTextPlugin", "changeText and change", null);
                        ((hk0.u0) ((jz5.n) gVar).getValue()).Q6(hk0.p.f281788f, charSequence.toString(), i17, i18, font);
                    }
                }
                mVar.f243651g.setShow(false);
                return;
            }
        }
        mVar.f243651g.setShow(false);
    }

    @Override // wu3.a1
    public void onCancel() {
        this.f243616a.f243651g.setShow(false);
    }
}
