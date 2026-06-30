package nf;

/* loaded from: classes7.dex */
public abstract class e {
    public static final java.lang.String a(org.json.JSONObject jSONObject, java.lang.String name) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(name, "name");
        return b(jSONObject, name, "");
    }

    public static final java.lang.String b(org.json.JSONObject jSONObject, java.lang.String name, java.lang.String fallback) {
        kotlin.jvm.internal.o.g(jSONObject, "<this>");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(fallback, "fallback");
        java.lang.Object opt = jSONObject.opt(name);
        return opt instanceof java.lang.String ? (java.lang.String) opt : fallback;
    }

    public static final boolean c(java.lang.String str, java.lang.String prefix, boolean z17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        if (r26.n0.N(prefix)) {
            return false;
        }
        if (!z17) {
            if (android.webkit.URLUtil.isHttpUrl(str)) {
                str = str.substring(7);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            } else if (android.webkit.URLUtil.isHttpsUrl(str)) {
                str = str.substring(8);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
        }
        return nf.z.d(str, prefix);
    }

    public static boolean d(java.lang.String str, java.lang.String prefix, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        if (!z17) {
            if (android.webkit.URLUtil.isHttpUrl(str)) {
                str = str.substring(7);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            } else if (android.webkit.URLUtil.isHttpsUrl(str)) {
                str = str.substring(8);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
        }
        return nf.z.d(str, prefix);
    }

    public static final java.util.ArrayList e(java.lang.Object[] objArr) {
        kotlin.jvm.internal.o.g(objArr, "<this>");
        return (java.util.ArrayList) kz5.z.C0(objArr);
    }

    public static final void f(yz5.a block) {
        kotlin.jvm.internal.o.g(block, "block");
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            block.invoke();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new nf.d(block));
        }
    }
}
