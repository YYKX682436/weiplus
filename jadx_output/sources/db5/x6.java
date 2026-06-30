package db5;

/* loaded from: classes11.dex */
public class x6 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public int f228571d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f228572e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMTagPanel f228573f;

    public x6(com.tencent.mm.ui.base.MMTagPanel mMTagPanel) {
        this.f228573f = mMTagPanel;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        java.lang.String str;
        int i28 = i17;
        com.tencent.mm.ui.base.MMTagPanel mMTagPanel = this.f228573f;
        boolean z17 = mMTagPanel.f197580i;
        this.f228571d = -1;
        java.util.List<java.lang.String> list = this.f228572e;
        ((java.util.LinkedList) list).clear();
        char[] cArr = new char[i18 - i28];
        android.text.TextUtils.getChars(charSequence, i28, i18, cArr, 0);
        char c17 = '\n';
        if (!mMTagPanel.f197583o) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            boolean z18 = false;
            while (i28 < i18) {
                char c18 = cArr[i28];
                if (c18 == '\n') {
                    z18 = true;
                } else {
                    sb6.append(c18);
                }
                i28++;
            }
            if (!z18) {
                return null;
            }
            java.lang.String sb7 = sb6.toString();
            sb6.insert(0, spanned.subSequence(0, i19));
            sb6.append(spanned.subSequence(i27, spanned.length()));
            mMTagPanel.post(new db5.u6(this, sb6));
            return sb7;
        }
        int i29 = i28;
        while (i29 < i18) {
            char c19 = cArr[i29];
            if (c19 == c17 || c19 == ',' || c19 == ';' || c19 == 12289 || c19 == 65292 || c19 == 65307) {
                int i37 = this.f228571d;
                if (-1 == i37) {
                    ((java.util.LinkedList) list).add((spanned.subSequence(0, i19).toString() + ((java.lang.Object) charSequence.subSequence(i28, i29))).trim());
                } else {
                    ((java.util.LinkedList) list).add(charSequence.subSequence(i37, i29).toString().trim());
                }
                this.f228571d = i29 + 1;
            }
            i29++;
            c17 = '\n';
        }
        if (mMTagPanel.H) {
            int f17 = com.tencent.mm.ui.tools.v4.f(spanned.toString());
            if (mMTagPanel.f197580i && charSequence.equals("\n") && 36 < f17) {
                ((java.util.LinkedList) list).clear();
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        if (mMTagPanel.C != null) {
            for (java.lang.String str2 : list) {
                if (str2.length() > 0) {
                    mMTagPanel.post(new db5.v6(this, str2));
                }
            }
        }
        if (this.f228571d >= i18) {
            spanned.length();
            str = spanned.subSequence(i27, spanned.length()).toString();
        } else {
            str = charSequence.subSequence(this.f228571d, i18).toString() + ((java.lang.Object) spanned.subSequence(i27, spanned.length()));
        }
        mMTagPanel.post(new db5.w6(this, str));
        return "";
    }
}
