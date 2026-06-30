package rj;

/* loaded from: classes3.dex */
public interface j {
    static /* synthetic */ void a(rj.j jVar, java.lang.String str, android.view.View view, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        ((b51.m) jVar).i(str, view, str2);
    }

    static void b(rj.j jVar, java.lang.String url, android.view.View pagView, java.lang.String customText, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
        if ((i17 & 8) != 0) {
            str = null;
        }
        b51.m mVar = (b51.m) jVar;
        mVar.getClass();
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(pagView, "pagView");
        kotlin.jvm.internal.o.g(customText, "customText");
        pagView.setTag(com.tencent.mm.R.id.f486237ko4, customText);
        mVar.i(url, pagView, str);
    }

    static /* synthetic */ java.lang.Object c(rj.j jVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        return ((b51.m) jVar).h(str, str2, continuation);
    }

    static /* synthetic */ java.lang.Object d(rj.j jVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadRfx");
        }
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        return ((b51.m) jVar).j(str, str2, continuation);
    }
}
