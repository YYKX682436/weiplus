package ti2;

/* loaded from: classes10.dex */
public final class p extends ti2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gk2.e buContext, si2.c callback) {
        super(buContext, callback);
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // ti2.o
    public java.lang.String n() {
        return "VisitorSearchUserConvert";
    }

    @Override // ti2.o
    public void p(android.widget.TextView nicknameTv, android.text.SpannableString nickName) {
        kotlin.jvm.internal.o.g(nicknameTv, "nicknameTv");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        this.f419575f.getClass();
        if (r26.n0.L(nickName, "", 0, false, 6, null) >= 0) {
            int L = r26.n0.L(nickName, "", 0, false, 6, null);
            int i17 = L + 0;
            if (L < 0 || i17 >= nickName.length() || L > i17) {
                com.tencent.mars.xlog.Log.w(this.f419576g, "invalid index beginIndex:" + L + " endIndex:" + i17 + " nickName:" + ((java.lang.Object) nickName) + " keyword:");
            } else {
                nickName.setSpan(new android.text.style.ForegroundColorSpan(nicknameTv.getContext().getResources().getColor(com.tencent.mm.R.color.aaq)), L, i17, 33);
            }
        }
        super.p(nicknameTv, nickName);
    }
}
