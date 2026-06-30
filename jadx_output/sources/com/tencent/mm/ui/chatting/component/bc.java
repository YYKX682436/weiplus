package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class bc implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f198730d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jb f198731e;

    public bc(com.tencent.mm.ui.chatting.component.jb jbVar, com.tencent.mm.ui.chatting.component.FootComponent$1 footComponent$1) {
        this.f198731e = jbVar;
    }

    public final void a(java.util.List list, java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (str.length() > 0 && str.substring(str.length() - 1, str.length()).matches("[_0-9a-zA-Z]$")) {
                list.add(str);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    public final boolean b(java.lang.String str, int i17) {
        if (str == null || i17 < 0 || str.length() <= i17) {
            return false;
        }
        if (i17 == 0 || !str.substring(i17 - 1, i17).matches("[_0-9a-zA-Z]$")) {
            return true;
        }
        if (this.f198730d == null) {
            this.f198730d = new java.util.LinkedList();
            com.tencent.mm.ui.chatting.component.jb jbVar = this.f198731e;
            a(this.f198730d, jbVar.f198580d.f460717l.getMMResources().getStringArray(com.tencent.mm.R.array.f478013a0));
            a(this.f198730d, jbVar.f198580d.f460717l.getMMResources().getStringArray(com.tencent.mm.R.array.f478014a1));
        }
        java.lang.String substring = str.substring(0, i17);
        java.util.Iterator it = this.f198730d.iterator();
        while (it.hasNext()) {
            if (substring.endsWith((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTextChanged(java.lang.CharSequence r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.bc.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
