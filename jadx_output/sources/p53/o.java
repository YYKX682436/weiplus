package p53;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f352068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p53.u f352070f;

    public o(p53.u uVar, jz5.l lVar, int i17) {
        this.f352070f = uVar;
        this.f352068d = lVar;
        this.f352069e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        jz5.l lVar = this.f352068d;
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        p53.u uVar = this.f352070f;
        if (!booleanValue) {
            uVar.a(uVar.f352081m);
            uVar.f352075d.setVisibility(8);
            return;
        }
        uVar.f352076e.setVisibility(8);
        uVar.f352080i.setBackgroundResource(com.tencent.mm.R.color.a9e);
        uVar.f352075d.setVisibility(0);
        java.lang.String str = (java.lang.String) lVar.f302834e;
        uVar.f352075d.setRepeatCount(this.f352069e);
        uVar.f352075d.setPath(str);
        uVar.f352075d.setScaleMode(3);
        uVar.f352075d.g();
    }
}
