package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.l2 f171200d = new com.tencent.mm.plugin.sns.ui.widget.l2();

    public l2() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$getEmoticonDrawable$1");
        java.lang.String md52 = (java.lang.String) obj;
        java.lang.String retPath = (java.lang.String) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$getEmoticonDrawable$1");
        kotlin.jvm.internal.o.g(md52, "md5");
        kotlin.jvm.internal.o.g(retPath, "retPath");
        android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(retPath);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentMediaLoadManager", "emoticon load success:" + md52 + " retPath: " + retPath + " width: " + n07.outWidth + " height: " + n07.outHeight);
        com.tencent.mm.plugin.sns.ui.widget.q2.f171251d.onThumbFinish(md52);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$getEmoticonDrawable$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$getEmoticonDrawable$1");
        return f0Var;
    }
}
