package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class w7 implements java.lang.Comparable {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.conversation.w7 f208220f = new com.tencent.mm.ui.conversation.w7(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public long f208221d;

    /* renamed from: e, reason: collision with root package name */
    public int f208222e;

    public w7() {
        this.f208221d = 0L;
        this.f208222e = 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(com.tencent.mm.ui.conversation.w7 w7Var) {
        if (this == w7Var) {
            return 0;
        }
        if (w7Var != null && f208220f != w7Var) {
            int i17 = this.f208222e;
            int i18 = w7Var.f208222e;
            if (i17 == i18 && this.f208221d == w7Var.f208221d) {
                return 0;
            }
            if (i17 != i18) {
                return i17 - i18;
            }
            long j17 = this.f208221d - w7Var.f208221d;
            if (j17 < 0) {
                return -1;
            }
            if (j17 == 0) {
                return 0;
            }
        }
        return 1;
    }

    public int hashCode() {
        return (this.f208222e << 31) | ((int) this.f208221d);
    }

    public w7(long j17, int i17) {
        this.f208221d = j17;
        this.f208222e = i17;
    }
}
