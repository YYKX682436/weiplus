package com.tencent.mm.ui.conversation;

/* loaded from: classes8.dex */
public final class j8 implements com.tencent.mm.ui.conversation.p5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.j8 f207782a = new com.tencent.mm.ui.conversation.j8();

    @Override // com.tencent.mm.ui.conversation.p5
    public boolean a(com.tencent.mm.ui.conversation.e8 context, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(context, "context");
        if (jSONObject != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "handle, can not, customExtraInfo is not null");
            return false;
        }
        yb5.d dVar = context.f207650a;
        r45.g15 g15Var = context.f207651b;
        byte[] bArr = context.f207652c;
        ot0.q qVar = new ot0.q();
        qVar.f348654f = g15Var.f374805e;
        qVar.f348666i = 33;
        java.lang.String str = g15Var.f374811n;
        if (str == null) {
            str = "";
        }
        qVar.f348673j2 = str;
        qVar.f348669i2 = g15Var.f374806f;
        java.lang.String str2 = g15Var.f374810m;
        if (str2 == null) {
            str2 = "";
        }
        qVar.f348677k2 = str2;
        qVar.f348737z2 = g15Var.f374814q;
        qVar.A2 = g15Var.f374815r;
        java.lang.String str3 = g15Var.f374816s;
        if (str3 == null) {
            str3 = "";
        }
        qVar.f348685m2 = str3;
        qVar.f348681l2 = 2;
        java.lang.String str4 = g15Var.f374819v;
        if (str4 == null) {
            str4 = "";
        }
        qVar.f348674k = str4;
        java.lang.String str5 = g15Var.f374813p;
        if (str5 == null) {
            str5 = "";
        }
        qVar.B2 = str5;
        qVar.L1 = "wxapp_" + g15Var.f374810m + g15Var.f374818u;
        java.lang.String str6 = g15Var.f374811n;
        if (str6 == null) {
            str6 = "";
        }
        qVar.f348722w = str6;
        java.lang.String str7 = g15Var.f374812o;
        if (str7 == null) {
            str7 = "";
        }
        qVar.f348726x = str7;
        com.tencent.mm.ui.conversation.i8 i8Var = new com.tencent.mm.ui.conversation.i8();
        java.lang.String str8 = g15Var.f374810m;
        i8Var.f207750e = str8 != null ? str8 : "";
        i8Var.f207749d = qVar;
        i8Var.f207754i = g15Var.f374805e;
        i8Var.f207752g = g15Var.f374807g;
        i8Var.f207751f = g15Var.f374809i;
        i8Var.f207753h = dVar.x();
        i8Var.f207755m = g15Var.f374808h;
        i8Var.f207756n = bArr;
        ((ku5.t0) ku5.t0.f312615d).g(i8Var);
        return true;
    }
}
