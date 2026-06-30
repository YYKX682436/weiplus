package com.tencent.mm.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/AtSomeOneResultReceiver;", "Landroid/support/v4/os/ResultReceiver;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AtSomeOneResultReceiver extends android.support.v4.os.ResultReceiver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtSomeOneResultReceiver(android.os.Handler handler) {
        super(handler);
        kotlin.jvm.internal.o.g(handler, "handler");
    }

    @Override // android.support.v4.os.ResultReceiver
    public void a(int i17, android.os.Bundle bundle) {
        int length;
        com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeOneResultReceiver", "onReceiveResult resultCode:%s, resultData:%s", java.lang.Integer.valueOf(i17), bundle);
        if (!com.tencent.mm.ui.i1.f208896f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AtSomeOneResultReceiver", "not first return from AT!!");
            return;
        }
        if (i17 != -1 || bundle == null) {
            return;
        }
        int i18 = 0;
        com.tencent.mm.ui.i1.f208896f = false;
        java.lang.String string = bundle.getString("KSelectUserList");
        java.lang.String string2 = bundle.getString("chatroomName");
        java.lang.String[] strArr = string != null ? (java.lang.String[]) r26.n0.f0(string, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]) : null;
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(string2);
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        if (string2 != null && string != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeOneResultReceiver", "update at someone record on receive result from transmit");
            ((qd0.c) ((rd0.s0) i95.n0.c(rd0.s0.class))).wi(string2, string);
        }
        kotlin.jvm.internal.o.d(strArr);
        for (java.lang.String str : strArr) {
            java.lang.String string3 = kotlin.jvm.internal.o.b(str, "notify@all") ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a6j, "") : c01.e2.t(z07, str, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeOneResultReceiver", "atSomeOne username:%s", str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                kotlin.jvm.internal.o.d(string3);
                linkedList.add(string3);
                java.util.LinkedHashMap linkedHashMap = com.tencent.mm.ui.i1.f208894d;
                if (linkedHashMap != null) {
                    linkedHashMap.put(string3, str);
                }
            }
        }
        android.widget.EditText editText = com.tencent.mm.ui.i1.f208891a;
        if (editText == null) {
            return;
        }
        java.lang.String obj = editText.getText().toString();
        java.lang.String substring = obj.substring(0, com.tencent.mm.ui.i1.f208893c);
        int i19 = com.tencent.mm.ui.i1.f208893c;
        for (java.lang.String str2 : linkedList) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                if (i18 > 0) {
                    substring = substring + "@" + str2 + (char) 8197;
                    length = str2.length() + 2;
                } else {
                    substring = substring + str2 + (char) 8197;
                    length = str2.length() + 1;
                }
                i19 += length;
            }
            i18++;
        }
        java.lang.String str3 = substring + obj.substring(com.tencent.mm.ui.i1.f208893c, obj.length());
        android.widget.EditText editText2 = com.tencent.mm.ui.i1.f208891a;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        float textSize = com.tencent.mm.ui.i1.f208891a.getTextSize();
        ((ke0.e) xVar).getClass();
        editText2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str3, textSize));
        if (i19 < 0 || i19 > com.tencent.mm.ui.i1.f208891a.getText().length()) {
            android.widget.EditText editText3 = com.tencent.mm.ui.i1.f208891a;
            editText3.setSelection(editText3.getText().length());
        } else {
            com.tencent.mm.ui.i1.f208891a.setSelection(i19);
        }
        com.tencent.mm.ui.i1.f208891a.setFocusable(true);
        com.tencent.mm.ui.i1.f208891a.setFocusableInTouchMode(true);
        com.tencent.mm.ui.i1.f208891a.requestFocus();
    }
}
