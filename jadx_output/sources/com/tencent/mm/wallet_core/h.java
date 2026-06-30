package com.tencent.mm.wallet_core;

/* loaded from: classes9.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f213799a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f213800b = new java.lang.ref.WeakReference(null);

    /* renamed from: c, reason: collision with root package name */
    public android.os.Bundle f213801c = new android.os.Bundle();

    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        return this;
    }

    public void B(android.app.Activity activity, java.lang.Class cls, android.os.Bundle bundle) {
        a("startActivity1", activity, cls, bundle);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) cls);
        intent.putExtra("process_id", getClass().hashCode());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (bundle != null) {
            this.f213801c.putAll(bundle);
        }
        this.f213801c.getInt("key_support_bankcard", 1);
    }

    public void C(android.app.Activity activity, java.lang.Class cls, android.os.Bundle bundle, android.os.Bundle bundle2) {
        a("startActivity1", activity, cls, bundle);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) cls);
        intent.putExtra("process_id", getClass().hashCode());
        if (bundle2 != null) {
            intent.putExtras(bundle2);
            intent.getExtras().toString();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (bundle != null) {
            this.f213801c.putAll(bundle);
        }
        this.f213801c.getInt("key_support_bankcard", 1);
    }

    public void D(android.app.Activity activity, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        java.lang.String str3;
        java.lang.Class<?> cls;
        a("startActivity3", activity, str, str2, bundle);
        java.util.List list = j45.l.f297713a;
        synchronized (j45.l.class) {
            java.lang.String str4 = "com.tencent.mm.plugin." + str;
            if (str2.startsWith(".")) {
                str3 = str4 + str2;
            } else {
                str3 = str2;
            }
            try {
                cls = com.tencent.mm.sdk.platformtools.x2.f193071a.getClassLoader().loadClass(str3);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PluginHelper", "plugin load failed, plugin=%s", str);
                cls = null;
            }
        }
        if (cls != null) {
            B(activity, cls, bundle);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ProcessManager", " Class Not Found! can't startActivity to " + str + str2);
    }

    public void E(android.app.Activity activity, java.lang.Class cls, android.os.Bundle bundle, int i17) {
        a("startActivityForResult1", activity, cls, bundle, java.lang.Integer.valueOf(i17));
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) cls);
        intent.putExtra("process_id", getClass().hashCode());
        intent.addFlags(67108864);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/wallet_core/WalletProcess", "startActivityForResult", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        if (bundle != null) {
            this.f213801c.putAll(bundle);
        }
    }

    public void a(java.lang.Object... objArr) {
        java.lang.String sb6;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(java.lang.String.format("this %s, procname %s", this, e()));
        if (objArr == null || objArr.length <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ProcessManager", "vals is null, use '' as value");
            sb6 = sb7.toString();
        } else {
            int length = objArr.length - 1;
            for (int i17 = 0; i17 < length; i17++) {
                sb7.append(u(objArr[i17]));
                sb7.append(',');
            }
            sb7.append(u(objArr[length]));
            sb6 = sb7.toString();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "__CURRENT__ %s", sb6);
    }

    public void b(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
    }

    public abstract void c(android.app.Activity activity, int i17);

    public void d(android.app.Activity activity, java.lang.Class cls, android.os.Bundle bundle, int i17) {
        a("finishActivity", activity, cls, "errCode " + i17);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) cls);
        intent.putExtra("process_id", getClass().hashCode());
        intent.addFlags(67108864);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/wallet_core/WalletProcess", "backActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/wallet_core/WalletProcess", "backActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f213801c.putInt("key_err_code", i17);
    }

    public abstract java.lang.String e();

    public abstract void f(android.app.Activity activity, android.os.Bundle bundle);

    public void g(android.app.Activity activity) {
        a("endProcess1", activity);
        if (!activity.isFinishing() && (activity instanceof com.tencent.mm.ui.MMActivity)) {
            ((com.tencent.mm.ui.MMActivity) activity).finish();
        }
        android.os.Bundle bundle = this.f213801c;
        if (bundle != null) {
            bundle.clear();
        }
        com.tencent.mm.wallet_core.a.i(getClass().hashCode());
    }

    public void h(android.app.Activity activity, java.lang.Class cls, int i17, android.content.Intent intent, boolean z17) {
        a("endProcess2", activity, cls, java.lang.Integer.valueOf(i17), intent, java.lang.Boolean.valueOf(z17));
        java.lang.ref.WeakReference weakReference = this.f213799a;
        if (weakReference != null && weakReference.get() != null) {
            intent = ((com.tencent.mm.wallet_core.g) this.f213799a.get()).onProcessEnd(i17, this.f213801c);
        }
        if (intent == null) {
            intent = new android.content.Intent(activity, (java.lang.Class<?>) cls);
            intent.putExtra("key_process_is_stay", z17);
        } else if (intent.getExtras() != null && !intent.getExtras().containsKey("key_process_is_stay")) {
            intent.putExtra("key_process_is_stay", true);
        }
        if (cls != null) {
            intent.setClass(activity, cls);
        }
        intent.addFlags(67108864);
        intent.putExtra("key_process_is_end", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/wallet_core/WalletProcess", "endProcess", "(Landroid/app/Activity;Ljava/lang/Class;ILandroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/wallet_core/WalletProcess", "endProcess", "(Landroid/app/Activity;Ljava/lang/Class;ILandroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        android.os.Bundle bundle = this.f213801c;
        if (bundle != null) {
            bundle.clear();
        }
        com.tencent.mm.wallet_core.a.i(getClass().hashCode());
    }

    public void i(android.app.Activity activity, java.lang.Class cls, int i17, boolean z17) {
        h(activity, cls, i17, null, z17);
    }

    public void j(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        k(activity, str, str2, -1, null, true);
    }

    public void k(android.app.Activity activity, java.lang.String str, java.lang.String str2, int i17, android.content.Intent intent, boolean z17) {
        a("endProcess3", activity, str, str2, java.lang.Integer.valueOf(i17), intent, java.lang.Boolean.valueOf(z17));
        android.content.Intent onProcessEnd = this.f213799a.get() != null ? ((com.tencent.mm.wallet_core.g) this.f213799a.get()).onProcessEnd(i17, this.f213801c) : null;
        if (intent == null) {
            intent = new android.content.Intent();
            intent.putExtra("key_process_is_stay", z17);
        } else if (intent.getExtras() != null && !intent.getExtras().containsKey("key_process_is_stay")) {
            intent.putExtra("key_process_is_stay", true);
        }
        if (onProcessEnd != null) {
            intent.putExtras(onProcessEnd);
        }
        intent.addFlags(67108864);
        intent.putExtra("key_process_is_end", true);
        j45.l.j(activity, str, str2, intent, null);
        android.os.Bundle bundle = this.f213801c;
        if (bundle != null) {
            bundle.clear();
        }
        com.tencent.mm.wallet_core.a.i(getClass().hashCode());
    }

    public void l(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        a("endProcess1", activity);
        if (!activity.isFinishing() && (activity instanceof com.tencent.mm.ui.MMActivity)) {
            ((com.tencent.mm.ui.MMActivity) activity).finish();
        }
        if (this.f213799a.get() != null) {
            ((com.tencent.mm.wallet_core.g) this.f213799a.get()).onProcessEnd(i17, bundle);
        }
        if (bundle != null) {
            bundle.clear();
        }
        com.tencent.mm.wallet_core.a.i(getClass().hashCode());
    }

    public void m(android.app.Activity activity) {
        a("finishActivity", activity);
        if (activity.isFinishing() || !(activity instanceof com.tencent.mm.ui.MMActivity)) {
            return;
        }
        ((com.tencent.mm.ui.MMActivity) activity).finish();
    }

    public boolean n() {
        java.lang.String string = this.f213801c.getString("key_bank_username");
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessManager", "follow bank account : isFollow " + this.f213801c.getBoolean("key_is_follow_bank_username", false) + ", username : " + string);
        if (!this.f213801c.getBoolean("key_is_follow_bank_username", false) || com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return false;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new com.tencent.mm.wallet_core.model.a1(string));
        return true;
    }

    public abstract void o(android.app.Activity activity, int i17, android.os.Bundle bundle);

    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        return null;
    }

    public int q(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        return -1;
    }

    public boolean r() {
        return this.f213801c.getBoolean("key_is_oversea", false);
    }

    public boolean s() {
        return this.f213801c.getInt("key_pay_flag", 0) == 1;
    }

    public abstract boolean t(android.app.Activity activity, android.os.Bundle bundle);

    public final java.lang.String u(java.lang.Object obj) {
        return obj == null ? "" : obj instanceof android.os.Bundle ? java.lang.String.format("Bundle: %s, ", obj.toString()) : obj instanceof android.content.Context ? java.lang.String.format("Context: %s, ", obj.toString()) : obj instanceof java.lang.Class ? java.lang.String.format("Class: %s, ", ((java.lang.Class) obj).getSimpleName()) : java.lang.String.format("Value: %s, ", obj.toString());
    }

    public boolean v(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }

    public boolean w(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI, int i17, java.lang.String str) {
        return false;
    }

    public void x() {
    }

    public void y(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
    }

    public void z(android.app.Activity activity) {
        a("specEndProcess", activity);
        if (!activity.isFinishing() && (activity instanceof com.tencent.mm.ui.MMActivity)) {
            ((com.tencent.mm.ui.MMActivity) activity).finish();
        }
        android.os.Bundle bundle = this.f213801c;
        if (bundle != null) {
            bundle.clear();
        }
        com.tencent.mm.wallet_core.a.i(getClass().hashCode());
        x();
    }
}
