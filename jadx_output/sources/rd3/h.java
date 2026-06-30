package rd3;

/* loaded from: classes7.dex */
public final class h implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd3.j f394243d;

    public h(rd3.j jVar) {
        this.f394243d = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MBJsApiShowModal", "cancel!");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("confirm", java.lang.Boolean.FALSE);
        hashMap.put("cancel", java.lang.Boolean.TRUE);
        rd3.j jVar = this.f394243d;
        jVar.s().invoke(jVar.l(hashMap));
    }
}
