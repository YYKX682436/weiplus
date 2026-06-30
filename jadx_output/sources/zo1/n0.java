package zo1;

/* loaded from: classes5.dex */
public final /* synthetic */ class n0 extends kotlin.jvm.internal.m implements yz5.a {
    public n0(java.lang.Object obj) {
        super(0, obj, com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI.class, "updateHintView", "updateHintView()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI checkPackageContentUI = (com.tencent.mm.plugin.backup.roambackup.ui.pkg.CheckPackageContentUI) this.receiver;
        zo1.w wVar = checkPackageContentUI.f92807p;
        if (wVar == null) {
            kotlin.jvm.internal.o.o("conversationAdapter");
            throw null;
        }
        if (wVar.f474806f == 0) {
            android.widget.TextView textView = checkPackageContentUI.f92805n;
            if (textView == null) {
                kotlin.jvm.internal.o.o("deleteHintTv");
                throw null;
            }
            textView.setVisibility(8);
            android.widget.Button button = checkPackageContentUI.f92806o;
            if (button == null) {
                kotlin.jvm.internal.o.o("deleteBtn");
                throw null;
            }
            button.setEnabled(false);
        } else {
            android.widget.TextView textView2 = checkPackageContentUI.f92805n;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("deleteHintTv");
                throw null;
            }
            textView2.setVisibility(0);
            java.util.Iterator it = checkPackageContentUI.f92812u.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                zo1.s sVar = (zo1.s) it.next();
                j17 += sVar.f474762c ? sVar.f474761b : 0L;
            }
            java.lang.String f07 = com.tencent.mm.sdk.platformtools.t8.f0(j17);
            kotlin.jvm.internal.o.f(f07, "getSizeKB(...)");
            android.widget.TextView textView3 = checkPackageContentUI.f92805n;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("deleteHintTv");
                throw null;
            }
            textView3.setText(checkPackageContentUI.getString(com.tencent.mm.R.string.mvi, f07));
            android.widget.Button button2 = checkPackageContentUI.f92806o;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("deleteBtn");
                throw null;
            }
            button2.setEnabled(true);
        }
        zo1.w wVar2 = checkPackageContentUI.f92807p;
        if (wVar2 == null) {
            kotlin.jvm.internal.o.o("conversationAdapter");
            throw null;
        }
        if (wVar2.x()) {
            android.widget.TextView textView4 = checkPackageContentUI.f92804m;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("selectAllTv");
                throw null;
            }
            textView4.setText(com.tencent.mm.R.string.a76);
        } else {
            android.widget.TextView textView5 = checkPackageContentUI.f92804m;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("selectAllTv");
                throw null;
            }
            textView5.setText(com.tencent.mm.R.string.f490681a75);
        }
        return jz5.f0.f302826a;
    }
}
