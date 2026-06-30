package m13;

/* loaded from: classes10.dex */
public final class c implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i13.j f322863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f322864b;

    public c(i13.j jVar, yz5.l lVar) {
        this.f322863a = jVar;
        this.f322864b = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transformMsgItem, forcePushId:");
        i13.j jVar = this.f322863a;
        sb6.append(jVar.field_ForcePushId);
        sb6.append(" username:");
        sb6.append(jVar.field_UserName);
        sb6.append(" nickname:");
        sb6.append(jVar.field_Description);
        sb6.append(" avatarUrl:");
        sb6.append(v5Var.field_brandIconURL);
        com.tencent.mars.xlog.Log.i("ForceNotifyUtil", sb6.toString());
        java.lang.String str = jVar.field_ForcePushId;
        java.lang.String str2 = jVar.field_UserName;
        java.lang.String str3 = jVar.field_Description;
        long j17 = jVar.field_CreateTime;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fev);
        java.lang.String str4 = v5Var.field_brandIconURL;
        kotlin.jvm.internal.o.d(str);
        kotlin.jvm.internal.o.d(str2);
        kotlin.jvm.internal.o.d(str3);
        kotlin.jvm.internal.o.d(string);
        this.f322864b.invoke(new i13.p(str, str2, str3, string, j17, str4));
    }
}
