package qm3;

/* loaded from: classes10.dex */
public final class c extends x.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm3.i f364767a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qm3.i iVar) {
        super(100);
        this.f364767a = iVar;
    }

    @Override // x.g
    public void entryRemoved(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        qm3.b key = (qm3.b) obj;
        java.lang.Object oldValue = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(oldValue, "oldValue");
        super.entryRemoved(z17, key, oldValue, (android.graphics.Bitmap) obj3);
        if (z17) {
            qm3.a a17 = this.f364767a.a(key.f364765a);
            a17.f364762d.remove(java.lang.Long.valueOf(key.f364766b));
        }
    }
}
