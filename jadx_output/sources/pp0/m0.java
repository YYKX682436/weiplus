package pp0;

/* loaded from: classes5.dex */
public interface m0 extends i95.m {
    static /* synthetic */ void V8(pp0.m0 m0Var, java.util.Map map, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addParams");
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        ((yy0.o7) m0Var).wi(map, str, str2);
    }

    static /* synthetic */ void ee(pp0.m0 m0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markEventEnd");
        }
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        if ((i17 & 4) != 0) {
            str3 = null;
        }
        if ((i17 & 8) != 0) {
            map = null;
        }
        ((yy0.o7) m0Var).Di(str, str2, str3, map);
    }

    static /* synthetic */ void n3(pp0.m0 m0Var, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markEventBegin");
        }
        if ((i17 & 2) != 0) {
            str2 = null;
        }
        ((yy0.o7) m0Var).Bi(str, str2);
    }
}
