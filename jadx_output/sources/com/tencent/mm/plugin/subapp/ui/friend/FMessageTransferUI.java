package com.tencent.mm.plugin.subapp.ui.friend;

@gm0.a2
/* loaded from: classes11.dex */
public class FMessageTransferUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public int f172182d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("friend_message_transfer_username");
        java.lang.String action = getIntent().getAction();
        if ("friend_message_verify_record".equals(action)) {
            android.content.Intent intent = new android.content.Intent();
            lk5.s.e(intent, true);
            j45.l.j(getContext(), "subapp", ".ui.friend.AddFriendVerifyRecordUI", intent, null);
            finish();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            finish();
            return;
        }
        if (r21.w.wi().W0() > 0) {
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.tencent.mm.modelsimple.g1.J("fmessage", 2);
        }
        r21.w.wi().i1(stringExtra);
        java.lang.Runnable runnable = r21.w.wi().f195204e;
        com.tencent.mm.sdk.platformtools.u3.l(runnable);
        com.tencent.mm.sdk.platformtools.u3.i(runnable, 500L);
        java.lang.String str = "friend_message_accept_" + stringExtra;
        this.f172182d = (stringExtra.hashCode() & Integer.MAX_VALUE) | 2130706432;
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(this.f172182d);
        if (str.equals(action)) {
            eg4.g1.a(getContext(), null, stringExtra, true);
        }
        finish();
    }
}
