package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes11.dex */
public class g0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f191211d;

    public g0(java.lang.String[] strArr) {
        this.f191211d = strArr;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = this.f191211d;
            if (i17 >= strArr.length) {
                return;
            }
            g4Var.f(i17, strArr[i17]);
            i17++;
        }
    }
}
