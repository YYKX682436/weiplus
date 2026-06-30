package kt;

@j95.b
/* loaded from: classes8.dex */
public class e extends i95.w implements lt.m0 {
    public java.lang.String Ai(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "buildUnistallUrl fail, invalid arguments");
            return null;
        }
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context);
        if (o17 == null || o17.length() == 0) {
            o17 = "zh_CN";
        } else if (o17.equals("en")) {
            o17 = "en_US";
        }
        return context.getString(com.tencent.mm.R.string.hfa, str, java.lang.Integer.valueOf(o45.wf.f343029g), o17, wo.q.f447780a, str2, 0);
    }

    public java.lang.String Bi(android.content.Context context, java.lang.String str) {
        android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, str, false);
        if (a17 != null && a17.length != 0) {
            return com.tencent.mm.pluginsdk.model.app.j1.e(kk.k.g(a17[0].toByteArray()));
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "signs is null");
        return null;
    }

    public com.tencent.mm.pluginsdk.model.app.i5 Di(java.lang.String str) {
        kk.l lVar = com.tencent.mm.pluginsdk.model.app.j5.f188948a;
        com.tencent.mm.pluginsdk.model.app.i5 i5Var = new com.tencent.mm.pluginsdk.model.app.i5();
        i5Var.f188938e = false;
        if (!lj.f.f(str)) {
            com.tencent.mm.pluginsdk.model.app.i5 i5Var2 = (com.tencent.mm.pluginsdk.model.app.i5) com.tencent.mm.pluginsdk.model.app.j5.f188948a.remove(str);
            if (i5Var2 != null) {
                i5Var = i5Var2;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(i5Var.f188935b)) {
                final java.lang.String str2 = i5Var.f188935b;
                ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.model.app.j5$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.util.List list = (java.util.List) com.tencent.mm.pluginsdk.model.app.j5.f188949b.remove(str2);
                        if (list != null) {
                            list.size();
                        }
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.pluginsdk.model.app.j5.f188948a.remove((java.lang.String) it.next());
                        }
                    }
                }, "OpenSDKTokenTask");
            }
        }
        return i5Var;
    }

    public boolean Ni(android.content.Context context, com.tencent.mm.pluginsdk.model.app.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppUtil", "check the signature of the Application.");
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "context is null.");
            return true;
        }
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "appInfo is null.");
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_packageName)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "packageName is null.");
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_signature)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "app.field_signature is null. app.field_packageName is %s", mVar.field_packageName);
            return true;
        }
        android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(context, mVar.field_packageName, false);
        if (a17 == null || a17.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "apk signatures is null");
        } else {
            java.util.List D0 = mVar.D0(mVar.field_packageName);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppUtil", "apk server signatures:%s", D0);
            for (android.content.pm.Signature signature : a17) {
                java.lang.String e17 = com.tencent.mm.pluginsdk.model.app.j1.e(kk.k.g(signature.toByteArray()));
                if (((java.util.ArrayList) D0).contains(e17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppUtil", "app_name : %s ,signature : %s", mVar.field_appName, e17);
                    return true;
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.AppUtil", "signature is diff.(app_name:%s)", mVar.field_appName);
        }
        return false;
    }

    public void Ri(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppUtil", "appid is null");
            return;
        }
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        if (d17 != null) {
            java.lang.String string = d17.getString("key_app_ids_registion_while_not_login", "");
            if (string.contains(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppUtil", "this app has been saved : %s in %s", str, string);
                return;
            }
            d17.edit().putString("key_app_ids_registion_while_not_login", str + "|" + string).commit();
        }
    }

    public void Ui(android.content.Context context, final java.lang.String str, final java.lang.String str2, int i17) {
        kk.l lVar = com.tencent.mm.pluginsdk.model.app.j5.f188948a;
        java.lang.String d17 = com.tencent.mm.pluginsdk.model.app.j1.d(context, str2);
        com.tencent.mm.pluginsdk.model.app.i5 i5Var = new com.tencent.mm.pluginsdk.model.app.i5();
        i5Var.f188934a = str;
        i5Var.f188935b = str2;
        i5Var.f188936c = d17;
        i5Var.f188937d = i17;
        i5Var.f188938e = true;
        com.tencent.mm.pluginsdk.model.app.j5.f188948a.put(str, i5Var);
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.pluginsdk.model.app.j5$$b
            @Override // java.lang.Runnable
            public final void run() {
                java.util.HashMap hashMap = com.tencent.mm.pluginsdk.model.app.j5.f188949b;
                java.lang.String str3 = str2;
                java.util.List list = (java.util.List) hashMap.get(str3);
                if (list != null) {
                    list.size();
                }
                if (list == null) {
                    list = new java.util.ArrayList();
                }
                list.add(str);
                hashMap.put(str3, list);
            }
        }, "OpenSDKTokenTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (r13.startsWith("http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/") != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String wi(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kt.e.wi(java.lang.String, java.lang.String):java.lang.String");
    }
}
