package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes8.dex */
public class m {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.ui.span.m f191266d = new com.tencent.mm.pluginsdk.ui.span.m();

    /* renamed from: a, reason: collision with root package name */
    public int f191267a;

    /* renamed from: b, reason: collision with root package name */
    public int f191268b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.l f191269c;

    public void a(java.lang.String str) {
        if (this.f191269c == null) {
            this.f191269c = new com.tencent.mm.pluginsdk.ui.span.l(this, null);
        }
        char[] charArray = str.toUpperCase().toCharArray();
        com.tencent.mm.pluginsdk.ui.span.l lVar = this.f191269c;
        for (int i17 = 0; i17 < charArray.length; i17++) {
            char c17 = charArray[i17];
            this.f191267a++;
            int i18 = c17 <= '9' ? c17 - '0' : (c17 - 'A') + 10;
            if (lVar.f191249b == null) {
                lVar.f191249b = new com.tencent.mm.pluginsdk.ui.span.l[36];
                this.f191268b += 36;
            }
            com.tencent.mm.pluginsdk.ui.span.l[] lVarArr = lVar.f191249b;
            if (lVarArr[i18] == null) {
                lVarArr[i18] = new com.tencent.mm.pluginsdk.ui.span.l(this, null);
                this.f191268b++;
            }
            lVar = lVarArr[i18];
            if (i17 == charArray.length - 1) {
                lVar.f191248a = true;
            }
        }
    }
}
