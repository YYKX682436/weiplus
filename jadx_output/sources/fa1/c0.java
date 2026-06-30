package fa1;

/* loaded from: classes7.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.zip.ZipInputStream f260678d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.util.zip.ZipInputStream zipInputStream) {
        super(0);
        this.f260678d = zipInputStream;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f260678d.getNextEntry();
    }
}
