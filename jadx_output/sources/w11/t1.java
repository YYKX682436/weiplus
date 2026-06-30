package w11;

/* loaded from: classes5.dex */
public abstract class t1 {
    public static final boolean a(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigSendMsgPPC()));
        if (valueOf != null && valueOf.intValue() == 1) {
            return (toUser.length() == 0) || !com.tencent.mm.storage.z3.K3(toUser);
        }
        return false;
    }
}
