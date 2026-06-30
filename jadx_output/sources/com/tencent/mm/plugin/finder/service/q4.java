package com.tencent.mm.plugin.finder.service;

@j95.b
/* loaded from: classes9.dex */
public final class q4 extends i95.w implements zy2.ib {
    public boolean wi(android.content.Context context, java.lang.String prefix, java.util.Map values, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(values, "values");
        r45.kv2 q17 = zy2.d5.q(prefix, values);
        if (q17 == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_context_id", str);
        intent.putExtra("report_scene", 11);
        intent.putExtra("from_user", c01.z1.r());
        intent.putExtra("feed_object_id", pm0.v.Z(q17.getString(0)));
        intent.putExtra("feed_object_nonceId", q17.getString(8));
        intent.putExtra("key_comment_scene", 25);
        intent.putExtra("key_reuqest_scene", 3);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(ya2.e1.f460472a, context, intent, false, 4, null);
        return true;
    }
}
