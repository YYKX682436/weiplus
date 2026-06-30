package com.tencent.mm.plugin.ting;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ting/TingMembershipTransparentUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TingMembershipTransparentUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f174625d = jz5.h.b(new rk4.n5(this));

    /* renamed from: e, reason: collision with root package name */
    public boolean f174626e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.o1.c(com.tencent.mm.plugin.ting.uic.j0.class));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f174626e = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipTransparentUI", "onUserCancel");
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((jz5.n) this.f174625d).getValue();
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_result_status", com.tencent.pigeon.ting.TingWecoinSubscribeStatus.CANCEL.ordinal());
            resultReceiver.send(0, bundle);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest = (com.tencent.mm.api.TingMemberShipSubscribeRequest) getIntent().getParcelableExtra("key_membership_request");
        if (tingMemberShipSubscribeRequest == null) {
            android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((jz5.n) this.f174625d).getValue();
            if (resultReceiver != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("key_result_status", com.tencent.pigeon.ting.TingWecoinSubscribeStatus.FAIL.ordinal());
                resultReceiver.send(0, bundle2);
                return;
            }
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.ting.uic.j0 j0Var = (com.tencent.mm.plugin.ting.uic.j0) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.ting.uic.j0.class);
        rk4.m5 m5Var = new rk4.m5(this);
        j0Var.getClass();
        j0Var.Q6();
        gl4.z zVar = (gl4.z) ((jz5.n) j0Var.f174762d).getValue();
        android.app.Activity context2 = j0Var.getContext();
        com.tencent.mm.plugin.ting.uic.h0 h0Var = new com.tencent.mm.plugin.ting.uic.h0(j0Var, tingMemberShipSubscribeRequest, m5Var);
        zVar.getClass();
        kotlin.jvm.internal.o.g(context2, "context");
        bw5.a90 a90Var = null;
        if (!(context2 instanceof androidx.fragment.app.FragmentActivity)) {
            h0Var.a(new qk.ea(qk.ga.f364136f, null));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", "startMembershipSubscribe request: " + tingMemberShipSubscribeRequest);
        bw5.w80 w80Var = tingMemberShipSubscribeRequest.f53212e;
        if (w80Var != null) {
            zVar.e((androidx.fragment.app.FragmentActivity) context2, tingMemberShipSubscribeRequest, w80Var, h0Var);
            return;
        }
        if (tingMemberShipSubscribeRequest.f53211d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingMembershipHelper", "startMembershipSubscribe fetchJoinInfo requestScene invalid");
            h0Var.a(new qk.ea(qk.ga.f364136f, null));
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context2, context2.getString(com.tencent.mm.R.string.f490468vx), true, 0, null);
        f17.show();
        java.lang.Integer num = tingMemberShipSubscribeRequest.f53211d;
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        gl4.y yVar = new gl4.y(f17, tingMemberShipSubscribeRequest, zVar, context2, h0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchMembershipJoinInfo requestScene: ");
        sb6.append(intValue);
        sb6.append('(');
        switch (intValue) {
            case 0:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeDefault;
                break;
            case 1:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeAutoPlayer;
                break;
            case 2:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeDiscoverTopToast;
                break;
            case 3:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeMembershipPage;
                break;
            case 4:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeUserPageDiscover;
                break;
            case 5:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAuto;
                break;
            case 6:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeTryWording;
                break;
            case 7:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAutoAD;
                break;
            case 8:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeUserPageDiscoverTopToast;
                break;
            case 9:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAutoBindQQMusic;
                break;
            case 10:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeUserPageDiscoverGoBindQQMusic;
                break;
            case 11:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeBindQQMusicRecharge;
                break;
            case 12:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAutoQQMusicGreenVip;
                break;
            case 13:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeVipLimitFreeIcon;
                break;
        }
        sb6.append(a90Var);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", sb6.toString());
        bw5.z80 z80Var = new bw5.z80();
        z80Var.f35857f = intValue;
        z80Var.f35859h[4] = true;
        jm4.c2 c2Var = (jm4.c2) ((jz5.n) zVar.f272899a).getValue();
        if (c2Var != null) {
            gl4.e eVar = new gl4.e(yVar);
            byte[] byteArray = z80Var.toByteArray();
            jm4.x1 x1Var = new jm4.x1();
            x1Var.f300447m = eVar;
            long cppPointer = ((jm4.d2) c2Var).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            urgen.ur_0025.UR_B0D8.UR_561C(cppPointer, byteArray, x1Var);
        }
    }
}
