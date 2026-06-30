package yv4;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv4.h f466217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv4.k f466218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dv4.h hVar, yv4.k kVar) {
        super(0);
        this.f466217d = hVar;
        this.f466218e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dv4.o oVar = this.f466217d.f244011c;
        yv4.k kVar = this.f466218e;
        com.tencent.mm.ui.base.WxImageView U6 = kVar.U6();
        kVar.f466229e = new android.graphics.RectF(oVar.f244024a * U6.getImageWidth(), oVar.f244025b * U6.getImageHeight(), oVar.f244026c * U6.getImageWidth(), oVar.f244027d * U6.getImageHeight());
        kVar.T6(true);
        return jz5.f0.f302826a;
    }
}
