package k50;

/* loaded from: classes.dex */
public final class c0 extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new ne5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        return ((ne5.a) c7()).j();
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        kotlin.jvm.internal.o.g(action, "action");
        ot0.q Z6 = Z6();
        java.lang.String str = Z6 != null ? Z6.f348654f : null;
        if (str == null) {
            str = d7();
        }
        ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).Ai(getActivity(), str, action.f454741b);
        return true;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        ot0.q Z6 = Z6();
        java.lang.String str = Z6 != null ? Z6.f348654f : null;
        if (str == null) {
            str = d7();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ForwardTextUIC", "processTextTransfer: msgContent empty");
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(toUser)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ForwardTextUIC", "processTextTransfer: toUser empty");
        } else {
            ((dk5.s5) tg3.t1.a()).fj(toUser, str, c01.e2.C(toUser), 0);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        ot0.q Z6 = Z6();
        if (!(Z6 != null && Z6.f348666i == 53)) {
            ot0.q Z62 = Z6();
            if (!(Z62 != null && Z62.f348666i == 57)) {
                ot0.q Z63 = Z6();
                if (!(Z63 != null && Z63.f348666i == 1)) {
                    return;
                }
            }
        }
        ne5.a aVar = (ne5.a) c7();
        ot0.q Z64 = Z6();
        java.lang.String str = Z64 != null ? Z64.f348654f : null;
        if (str == null) {
            str = d7();
        }
        aVar.n(str);
    }
}
