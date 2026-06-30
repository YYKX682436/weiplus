package da2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ da2.g f227735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(da2.g gVar) {
        super(2);
        this.f227735d = gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Intent intent;
        android.content.Context targetContext = (android.content.Context) obj;
        java.lang.String audioPath = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(targetContext, "targetContext");
        kotlin.jvm.internal.o.g(audioPath, "audioPath");
        da2.g gVar = this.f227735d;
        gVar.getClass();
        android.app.Activity activity = targetContext instanceof android.app.Activity ? (android.app.Activity) targetContext : null;
        long j17 = 0;
        if (activity != null && (intent = activity.getIntent()) != null) {
            j17 = intent.getLongExtra("key_source_feed_id", 0L);
        }
        gVar.i(1001, targetContext, j17);
        return jz5.f0.f302826a;
    }
}
