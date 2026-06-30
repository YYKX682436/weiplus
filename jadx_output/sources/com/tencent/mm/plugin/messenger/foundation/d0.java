package com.tencent.mm.plugin.messenger.foundation;

@j95.b
/* loaded from: classes11.dex */
public class d0 extends i95.w implements vg3.r3 {
    public void wi(android.content.Context context, yz5.l callback) {
        ah3.m mVar = ah3.m.f4905a;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            kotlinx.coroutines.l.d(v65.m.b(appCompatActivity), kotlinx.coroutines.q1.f310568a, null, new ah3.l(callback, null), 2, null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BatchGetContactHelper", "tryRequest not lifeCycleOwner");
            callback.invoke(java.lang.Boolean.FALSE);
        }
    }
}
