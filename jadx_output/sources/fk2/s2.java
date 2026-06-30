package fk2;

/* loaded from: classes3.dex */
public final class s2 extends fk2.n2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.String string;
        android.text.SpannableString spannableString;
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z17 = true;
        boolean z18 = false;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.D0(msg.a(), c01.z1.r()) || com.tencent.mm.sdk.platformtools.t8.D0(msg.a(), xy2.c.e(context));
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.drawable.c4d);
        drawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) this.f445242c).getValue()).intValue(), ((java.lang.Number) ((jz5.n) this.f445243d).getValue()).intValue());
        al5.w wVar = new al5.w(drawable, 1);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("  ");
        spannableStringBuilder.setSpan(wVar, 0, 1, 33);
        if (z19) {
            string = context.getResources().getString(com.tencent.mm.R.string.dsx);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            z17 = false;
        } else {
            string = kotlin.jvm.internal.o.b(this.f445240a.w(), msg.a()) ? context.getString(com.tencent.mm.R.string.dsj) : zl2.r4.D0(zl2.r4.f473950a, msg.a(), msg.k(), false, 4, null);
            kotlin.jvm.internal.o.d(string);
        }
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.dsi);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        if (kotlin.jvm.internal.o.b(string, context.getResources().getString(com.tencent.mm.R.string.dsx))) {
            spannableString = new android.text.SpannableString(context.getResources().getString(com.tencent.mm.R.string.dsw, string2));
        } else {
            z18 = z17;
            spannableString = new android.text.SpannableString(context.getResources().getString(com.tencent.mm.R.string.dsv, string, string2));
        }
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
        mMNeat7extView.setTag(com.tencent.mm.R.id.f484412e65, spannableString);
        mMNeat7extView.setTag(com.tencent.mm.R.id.e68, string2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(mMNeat7extView, "finder_live_comment_red_packet");
        if (msg instanceof dk2.la) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(mMNeat7extView, 8, 25561);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(mMNeat7extView, new fk2.q2(msg));
        }
        if (z18) {
            str = string2;
            int L = r26.n0.L(spannableString, string, 0, false, 6, null);
            if (L >= 0 && string.length() + L <= spannableString.length()) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479222ta)), L, string.length() + L, 33);
            }
        } else {
            str = string2;
        }
        int L2 = r26.n0.L(spannableString, str, 0, false, 6, null);
        if (L2 >= 0 && str.length() + L2 <= spannableString.length()) {
            spannableString.setSpan(new fk2.r2(msg, this, context), L2, str.length() + L2, 33);
        }
        spannableStringBuilder.append((java.lang.CharSequence) spannableString);
        mMNeat7extView.b(spannableStringBuilder);
        mMNeat7extView.setTextSize(this.f445247h);
        holder.f21929g.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.la(msg);
    }

    @Override // we2.o
    public int n() {
        return 20019;
    }
}
