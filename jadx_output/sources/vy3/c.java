package vy3;

/* loaded from: classes.dex */
public final class c extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.c f441466e = new vy3.c();

    public static final void e(vy3.c cVar, android.content.Context context, java.lang.String str) {
        cVar.getClass();
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT", android.provider.ContactsContract.Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.item/person");
        intent.putExtra("phone", str);
        if (com.tencent.mm.sdk.platformtools.t8.I0(context, intent, false, false)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/scanner/box/jsapi/JsApiAddToAddressBook", "phoneModifyContact", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiOpenDialPad", e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String[] strArr;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("phoneNum");
        if (str == null) {
            str = "";
        }
        java.lang.String obj = r26.n0.u0(str).toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenDialPad", "ScanJsApi-Call doAddToAddressBook phoneNum: " + obj);
        boolean z17 = obj == null || r26.n0.N(obj);
        nw4.g gVar = env.f340863d;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenDialPad", "ScanJsApi-Call doAddToAddressBook param is empty");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("ret", "1");
            gVar.e(msg.f341013c, msg.f341019i + ":param invalid", hashMap);
        } else {
            if (f() && com.tencent.mm.sdk.platformtools.t8.I0(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI), false, false)) {
                strArr = env.f340860a.getResources().getStringArray(com.tencent.mm.R.array.f478015a2);
                kotlin.jvm.internal.o.d(strArr);
            } else {
                strArr = f() ? new java.lang.String[]{env.f340860a.getResources().getString(com.tencent.mm.R.string.f492926ia2)} : new java.lang.String[]{env.f340860a.getResources().getString(com.tencent.mm.R.string.f492927ia3)};
            }
            android.content.Context context = env.f340860a;
            android.view.LayoutInflater.from(context);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            new java.util.ArrayList();
            vy3.a aVar = new vy3.a(strArr);
            vy3.b bVar = new vy3.b(env, obj);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f228381y = null;
                h4Var.f228382z = null;
            }
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.String[] strArr2 = aVar.f441463d;
            int length = strArr2.length;
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String str2 = strArr2[i17];
                db5.h4 h4Var2 = new db5.h4(context, i17, 0);
                h4Var2.f228368i = str2;
                arrayList2.add(h4Var2);
            }
            if (arrayList2.size() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                k0Var.f211872n = aVar;
                k0Var.f211881s = bVar;
                k0Var.f211854d = null;
                k0Var.G = null;
                k0Var.v();
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("ret", "0");
            gVar.e(msg.f341013c, msg.f341019i + ":ok", hashMap2);
        }
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "addToAddressBook";
    }

    public final boolean f() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/contact");
        intent.putExtra("phone", "10086");
        return com.tencent.mm.sdk.platformtools.t8.I0(context, intent, false, false);
    }
}
