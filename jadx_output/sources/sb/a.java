package sb;

/* loaded from: classes13.dex */
public abstract class a implements sb.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f405376a;

    /* renamed from: b, reason: collision with root package name */
    public final sb.d f405377b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f405378c;

    public a(sb.d dVar, sb.j jVar, java.util.HashMap hashMap, java.lang.String str) {
        this.f405376a = "";
        this.f405377b = dVar;
        this.f405378c = hashMap;
        this.f405376a = str;
        java.util.HashMap hashMap2 = dVar.f405395a;
        if (hashMap2 != null) {
            hashMap2.put(str, jVar);
        }
    }

    public abstract void a(sb.c cVar);

    public void b(sb.c cVar) {
        this.f405378c.remove(this.f405376a);
        byte[] bArr = cVar.f405392g;
        sb.d dVar = this.f405377b;
        if (bArr == null) {
            android.os.Message message = new android.os.Message();
            message.what = 4;
            message.obj = this;
            dVar.sendMessage(message);
            return;
        }
        c(bArr, cVar);
        android.os.Message message2 = new android.os.Message();
        message2.what = 3;
        message2.obj = this;
        dVar.sendMessage(message2);
    }

    public abstract void c(byte[] bArr, sb.c cVar);

    public abstract void d(byte[] bArr, int i17, long j17, sb.c cVar);

    public abstract void e(sb.c cVar);
}
