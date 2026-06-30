package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class c0 extends m05.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        n05.d dVar = n05.d.f333929d;
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) activity;
        n05.a aVar = new n05.a(true, true, 300L, null, com.tencent.mm.R.id.keyboard_action, dVar.toString(), mMFragmentActivity, false, 0, 0);
        aVar.f333924b = 500L;
        O6("keyboard_show_1", aVar);
        n05.a aVar2 = new n05.a(true, true, 300L, null, com.tencent.mm.R.id.keyboard_action, dVar.toString(), mMFragmentActivity, false, 0, 0);
        aVar.f333924b = 500L;
        O6("keyboard_show_2", aVar2);
    }

    public final void T6(int i17) {
        n05.d dVar = n05.d.f333929d;
        if (i17 == 1) {
            Q6(dVar.toString());
        } else {
            Q6(dVar.toString());
            Q6(n05.d.f333930e.toString());
        }
    }

    public final void U6(int i17) {
        if (i17 == 1) {
            R6(m05.n.f322580g, "keyboard_show_1");
        } else {
            if (i17 != 2) {
                return;
            }
            R6(m05.n.f322580g, "keyboard_show_2");
        }
    }
}
