package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class VoipAddressUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public java.util.List C;
    public boolean D = false;
    public boolean E = false;
    public java.lang.String F = "";
    public final com.tencent.mm.sdk.event.IListener G = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.ui.contact.VoipAddressUI.1
        {
            this.__eventId = -797557590;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
            int i17 = voipEvent.f54945g.f8415b;
            com.tencent.mm.ui.contact.VoipAddressUI voipAddressUI = com.tencent.mm.ui.contact.VoipAddressUI.this;
            if (i17 == 7) {
                voipAddressUI.finish();
                return false;
            }
            if (i17 != 8) {
                return false;
            }
            voipAddressUI.finish();
            return false;
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static void y7(android.content.Context context) {
        boolean z17 = 1 == com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VOIPCallType"), 0) ? 1 : 0;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.contact.VoipAddressUI.class);
        intent.putExtra("Add_address_titile", context.getString(com.tencent.mm.R.string.f489934fx));
        intent.putExtra("voip_video", z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/contact/VoipAddressUI", "inviteVoip", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/contact/VoipAddressUI", "inviteVoip", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11034, 1, java.lang.Integer.valueOf(!z17));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        com.tencent.mm.ui.contact.i0 i0Var = new com.tencent.mm.ui.contact.i0();
        i0Var.f206762b = true;
        i0Var.f206761a = true;
        return new com.tencent.mm.ui.contact.h0(this, this.C, true, false, i0Var);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new com.tencent.mm.ui.contact.f5(this, this.C, false, this.A);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        return new int[]{131072};
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        java.lang.String stringExtra = getIntent().getStringExtra("Add_address_titile");
        return !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? getString(com.tencent.mm.R.string.f489934fx) : stringExtra;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.tencent.mm.ui.contact.item.d dVar = (com.tencent.mm.ui.contact.item.d) this.f206446d.getAdapter().getItem(i17);
        if (dVar == null || (str = dVar.f206850s) == null) {
            return;
        }
        this.F = str;
        if (this.E) {
            x7();
        } else {
            w7();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        java.lang.String stringExtra = getIntent().getStringExtra("LauncherUI.Shortcut.LaunchType");
        this.E = getIntent().getBooleanExtra("voip_video", true);
        if (stringExtra != null) {
            this.D = true;
            if (stringExtra.equals("launch_type_voip")) {
                this.E = true;
            } else if (stringExtra.equals("launch_type_voip_audio")) {
                this.E = false;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.C = arrayList;
        arrayList.addAll(com.tencent.mm.ui.contact.i5.b());
        this.C.addAll(c01.e2.i());
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.G.alive();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.G.dead();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipAddressUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipAddressUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 19) {
            if (i17 != 82) {
                return;
            }
            if (iArr[0] == 0) {
                w7();
                return;
            } else {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.ui.contact.nc(this), null);
                return;
            }
        }
        if (iArr[0] == 0) {
            x7();
            return;
        }
        int i18 = "android.permission.CAMERA".equals(strArr[0]) ? com.tencent.mm.R.string.hh8 : com.tencent.mm.R.string.hhn;
        if (iArr[0] == 0) {
            return;
        }
        db5.e1.C(this, getString(i18), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.ui.contact.lc(this), new com.tencent.mm.ui.contact.mc(this));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void p7() {
        if (this.D) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.LauncherUI.class);
            intent.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/VoipAddressUI", "onBackBtnPress", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/contact/VoipAddressUI", "onBackBtnPress", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        hideVKB();
        finish();
    }

    public void w7() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.RECORD_AUDIO", 82, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), this);
        if (a17) {
            com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
            am.y00 y00Var = voipEvent.f54945g;
            y00Var.f8415b = 5;
            y00Var.f8418e = this.F;
            y00Var.f8417d = this;
            int i17 = this.D ? 2 : 1;
            y00Var.f8419f = 3;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11033, java.lang.Integer.valueOf(i17), 2, 0);
            voipEvent.e();
            hideVKB();
        }
    }

    public final void x7() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.CAMERA", 19, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), this);
        if (a17) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a18 = j35.u.a(this, "android.permission.RECORD_AUDIO", 19, "", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.VoipAddressUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", java.lang.Boolean.valueOf(a18), new com.tencent.mm.sdk.platformtools.z3(), this);
            if (a18) {
                com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
                am.y00 y00Var = voipEvent.f54945g;
                y00Var.f8415b = 5;
                y00Var.f8418e = this.F;
                y00Var.f8417d = this;
                int i17 = this.D ? 2 : 1;
                y00Var.f8419f = 2;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11033, java.lang.Integer.valueOf(i17), 1, 0);
                voipEvent.e();
                hideVKB();
            }
        }
    }
}
