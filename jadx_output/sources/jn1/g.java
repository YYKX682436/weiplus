package jn1;

/* loaded from: classes11.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn1.h f300493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jn1.h hVar) {
        super(1);
        this.f300493d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof jn1.d)) {
            this.f300493d.a(new jn1.e((com.tencent.mm.modelavatar.r0) state.d("Avatar_ImgFlag")));
        }
        return jz5.f0.f302826a;
    }
}
