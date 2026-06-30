package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class d0 {
    public static final kotlinx.coroutines.internal.v0 a(yz5.l lVar, java.lang.Object obj, kotlinx.coroutines.internal.v0 v0Var) {
        try {
            lVar.invoke(obj);
        } catch (java.lang.Throwable th6) {
            if (v0Var == null || v0Var.getCause() == th6) {
                return new kotlinx.coroutines.internal.v0("Exception in undelivered element handler for " + obj, th6);
            }
            jz5.a.a(v0Var, th6);
        }
        return v0Var;
    }
}
