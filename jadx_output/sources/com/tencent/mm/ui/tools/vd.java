package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class vd {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f210854a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f210855b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f210856c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f210857d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f210858e;

    public vd(android.widget.EditText editText) {
        this.f210855b = new java.lang.ref.WeakReference(editText);
    }

    public static java.util.List a(java.lang.String str, java.util.ArrayList arrayList) {
        int indexOf;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || arrayList == null || arrayList.size() == 0) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int length = str.length();
        int i17 = 0;
        while (true) {
            if (i17 > length) {
                break;
            }
            java.util.Iterator it = arrayList.iterator();
            int i18 = length;
            int i19 = 0;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (indexOf = str.indexOf(str2, i17)) >= 0 && (indexOf < i18 || (indexOf == i18 && str2.length() > i19))) {
                    i19 = str2.length();
                    i18 = indexOf;
                }
            }
            if (i18 < length) {
                if (i18 > i17) {
                    arrayList2.add(new com.tencent.mm.ui.tools.ud(i17, i18 - i17, false));
                }
                arrayList2.add(new com.tencent.mm.ui.tools.ud(i18, i19, true));
                i17 = i18 + i19;
            } else if (i18 > i17) {
                arrayList2.add(new com.tencent.mm.ui.tools.ud(i17, i18 - i17, false));
            }
        }
        return arrayList2;
    }

    public static boolean b(android.widget.EditText editText, java.util.ArrayList arrayList) {
        int i17;
        java.lang.String obj = editText.getText().toString();
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.List a17 = a(obj, arrayList);
        if (a17 != null) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) a17;
            if (arrayList2.size() > 0) {
                int selectionStart = editText.getSelectionStart();
                int selectionEnd = editText.getSelectionEnd();
                android.content.Context context = editText.getContext();
                android.text.TextPaint paint = editText.getPaint();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.ui.tools.ud udVar = (com.tencent.mm.ui.tools.ud) it.next();
                    int i18 = udVar.f210829a;
                    int i19 = udVar.f210830b;
                    if (i18 < 0 || i19 <= 0 || (i17 = i18 + i19) > obj.length()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WordsChecker", "start : %d, length : %d.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    } else if (udVar.f210831c) {
                        java.lang.String substring = obj.substring(i18, i17);
                        android.text.SpannableString spannableString = new android.text.SpannableString(substring);
                        spannableString.setSpan(new android.text.style.ImageSpan(new com.tencent.mm.ui.tools.td(context, substring, paint), 0), 0, substring.length(), 33);
                        spannableStringBuilder.append((java.lang.CharSequence) spannableString);
                    } else {
                        spannableStringBuilder.append((java.lang.CharSequence) obj.substring(i18, i17));
                    }
                }
                if (spannableStringBuilder.length() <= 0) {
                    return true;
                }
                editText.setText(spannableStringBuilder);
                editText.setTextKeepState(spannableStringBuilder);
                if (selectionStart != selectionEnd || selectionStart < 0) {
                    return true;
                }
                editText.setSelection(selectionStart);
                return true;
            }
        }
        return false;
    }

    public final com.tencent.mm.ui.tools.ud c(android.text.Editable editable, int i17) {
        java.util.List list = this.f210854a;
        if (list == null) {
            return null;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.tools.ud udVar = (com.tencent.mm.ui.tools.ud) it.next();
            int i18 = udVar.f210829a;
            if (i17 <= udVar.f210830b + i18 && i17 > i18) {
                return udVar;
            }
        }
        return null;
    }
}
