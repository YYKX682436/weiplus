package sf2;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f407110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List list) {
        super(1);
        this.f407110d = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.z22 song = (r45.z22) obj;
        kotlin.jvm.internal.o.g(song, "song");
        return java.lang.Boolean.valueOf(this.f407110d.contains(song.f391629f));
    }
}
