package kv5;

/* loaded from: classes16.dex */
public class a implements cv5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.io.ByteArrayInputStream f312752a;

    public a(kv5.f fVar, java.io.ByteArrayInputStream byteArrayInputStream) {
        this.f312752a = byteArrayInputStream;
    }

    @Override // cv5.a
    public byte readByte() {
        return (byte) (this.f312752a.read() & 255);
    }
}
