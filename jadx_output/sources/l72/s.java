package l72;

/* loaded from: classes11.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI f316862d;

    public s(com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI) {
        this.f316862d = faceAgreementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI = this.f316862d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "needShowProtocal : %s", java.lang.Boolean.valueOf(faceAgreementUI.f100206r));
        if (faceAgreementUI.f100206r) {
            faceAgreementUI.f100207s = true;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(faceAgreementUI.getContext(), 1, 3);
            faceAgreementUI.f100205q = z2Var;
            z2Var.m(faceAgreementUI.getString(com.tencent.mm.R.string.c6c), faceAgreementUI.getString(com.tencent.mm.R.string.c6_));
            com.tencent.mm.ui.widget.dialog.z2 z2Var2 = faceAgreementUI.f100205q;
            l72.z zVar = new l72.z(faceAgreementUI);
            l72.a0 a0Var = new l72.a0(faceAgreementUI);
            z2Var2.D = zVar;
            z2Var2.E = a0Var;
            android.view.View inflate = android.view.View.inflate(faceAgreementUI.getContext(), com.tencent.mm.R.layout.a_y, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.dmi);
            if (com.tencent.mm.sdk.platformtools.t8.K0(faceAgreementUI.f100201m)) {
                textView.setText(faceAgreementUI.getString(com.tencent.mm.R.string.c6b));
            } else {
                textView.setText(faceAgreementUI.f100201m);
            }
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            faceAgreementUI.f100205q.s(inflate);
            android.view.View inflate2 = android.view.View.inflate(faceAgreementUI.getContext(), com.tencent.mm.R.layout.a_x, null);
            android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.dmh);
            faceAgreementUI.f100199h = textView2;
            com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
            java.lang.String str = faceAgreementUI.f100200i;
            android.widget.TextView textView3 = faceAgreementUI.f100199h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.String.format(str, com.tencent.mm.sdk.platformtools.m2.f(faceAgreementUI)));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.String string = !com.tencent.mm.sdk.platformtools.t8.K0(faceAgreementUI.f100202n) ? faceAgreementUI.f100202n : faceAgreementUI.getString(com.tencent.mm.R.string.c6e);
            arrayList3.add(string);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                java.lang.String str2 = (java.lang.String) arrayList3.get(i17);
                int indexOf = string.indexOf(str2);
                int length = str2.length() + indexOf;
                if (indexOf >= 0 && length <= string.length()) {
                    spannableString.setSpan(new l72.c0((java.lang.String) arrayList2.get(i17), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2), true, new l72.x(faceAgreementUI, faceAgreementUI)), indexOf, length, 17);
                }
            }
            if (textView3 != null) {
                textView3.setText(spannableString);
                textView3.setOnTouchListener(new l72.y(faceAgreementUI, spannableString, textView3));
            }
            faceAgreementUI.f100205q.j(inflate2);
            faceAgreementUI.f100205q.C();
        } else {
            android.content.Intent intent = new android.content.Intent(faceAgreementUI, (java.lang.Class<?>) com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI.class);
            android.os.Bundle extras = faceAgreementUI.getIntent().getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            intent.putExtra("needContract", faceAgreementUI.f100206r);
            faceAgreementUI.startActivityForResult(intent, 1);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 67L, 1L, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
