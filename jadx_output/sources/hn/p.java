package hn;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f282367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f282368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f282369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f282370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f282371h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.modelbase.o oVar, int i17, int i18, android.content.Context context) {
        super(0);
        this.f282367d = h0Var;
        this.f282368e = oVar;
        this.f282369f = i17;
        this.f282370g = i18;
        this.f282371h = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.j8 j8Var;
        r45.j8 j8Var2;
        r45.j8 j8Var3;
        r45.j8 j8Var4;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f282367d.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String str = null;
        com.tencent.mm.modelbase.o oVar = this.f282368e;
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
        r45.qz qzVar = fVar instanceof r45.qz ? (r45.qz) fVar : null;
        int i17 = this.f282369f;
        android.content.Context context = this.f282371h;
        boolean z17 = true;
        if (i17 == 0 && this.f282370g == 0 && qzVar != null) {
            java.lang.String str2 = qzVar.f384359d;
            if (!(str2 == null || str2.length() == 0)) {
                java.lang.String element = qzVar.f384359d;
                kotlin.jvm.internal.o.f(element, "element");
                if (!nf.e.c(element, "http", true)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomOpenService", "join chat room url is not http:".concat(element));
                    element = "http://".concat(element);
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", element);
                intent.putExtra(com.tencent.mm.ui.w2.f211206s, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomOpenService", "join room url:" + element);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                return jz5.f0.f302826a;
            }
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClassName(context, "com.tencent.mm.chatroom.ui.ChatRoomOpenErrorInfoUI");
        java.lang.String str3 = (qzVar == null || (j8Var4 = qzVar.f384360e) == null) ? null : j8Var4.f377633d;
        java.lang.String string = str3 == null || str3.length() == 0 ? context.getString(com.tencent.mm.R.string.ay6) : (qzVar == null || (j8Var = qzVar.f384360e) == null) ? null : j8Var.f377633d;
        java.lang.String str4 = (qzVar == null || (j8Var3 = qzVar.f384360e) == null) ? null : j8Var3.f377634e;
        if (str4 != null && str4.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str = string;
        } else if (qzVar != null && (j8Var2 = qzVar.f384360e) != null) {
            str = j8Var2.f377634e;
        }
        intent2.putExtra("key_error_title", string);
        intent2.putExtra("key_error_content", str);
        android.content.Context context2 = this.f282371h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppJoinChatRoom$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/chatroom/api/ChatRoomOpenService$doCheckAppJoinChatRoom$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
