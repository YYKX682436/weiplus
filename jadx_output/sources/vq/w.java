package vq;

/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final vq.w f439230d = new vq.w();

    public w() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f21.e eVar = (f21.e) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(eVar.f258872e);
        sb6.append(": \n");
        sb6.append(eVar.f258875h);
        sb6.append(" - ");
        sb6.append(eVar.f258876i);
        sb6.append("\n ");
        java.util.LinkedList keyWords = eVar.f258871d;
        kotlin.jvm.internal.o.f(keyWords, "keyWords");
        sb6.append(kz5.n0.g0(keyWords, "\n", null, null, 0, null, vq.v.f439228d, 30, null));
        sb6.append("\n---");
        return sb6.toString();
    }
}
