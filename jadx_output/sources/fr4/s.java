package fr4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ fr4.s[] f265860d;

    static {
        fr4.s[] sVarArr = {new fr4.s("ListUI", 0, "w1w-personal-msg-chat-list"), new fr4.s("Chat", 1, "w1w-personal-msg-chat")};
        f265860d = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17, java.lang.String str2) {
    }

    public static fr4.s valueOf(java.lang.String str) {
        return (fr4.s) java.lang.Enum.valueOf(fr4.s.class, str);
    }

    public static fr4.s[] values() {
        return (fr4.s[]) f265860d.clone();
    }
}
