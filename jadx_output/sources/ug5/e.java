package ug5;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ug5.e f427586d = new ug5.e();

    public e() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ug5.g gVar;
        yz5.l lVar;
        android.app.Activity activity = (android.app.Activity) obj;
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String stringExtra = activity.getIntent().getStringExtra("intent_key_view_performer");
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove performerCache key: ");
            java.util.HashMap hashMap = ug5.v.f427657i;
            sb6.append(hashMap);
            com.tencent.mars.xlog.Log.i("ViewFluentPerformer", sb6.toString());
            ug5.v vVar = (ug5.v) hashMap.remove(stringExtra);
            if (vVar != null && (gVar = vVar.f427658a) != null && (lVar = gVar.f427591e) != null) {
                lVar.invoke(gVar);
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
