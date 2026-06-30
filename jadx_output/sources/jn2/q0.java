package jn2;

/* loaded from: classes10.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r0 f300669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f300670e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(jn2.r0 r0Var, java.util.List list) {
        super(1);
        this.f300669d = r0Var;
        this.f300670e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.z22 song = (r45.z22) obj;
        kotlin.jvm.internal.o.g(song, "song");
        java.lang.String str = song.f391629f;
        if (!(str == null || str.length() == 0) && this.f300669d.f300679h.contains(song.f391629f)) {
            this.f300670e.add(song);
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
    }
}
