package r26;

/* loaded from: classes12.dex */
public abstract class y {
    public static final void a(java.lang.Appendable appendable, java.lang.Object obj, yz5.l lVar) {
        kotlin.jvm.internal.o.g(appendable, "<this>");
        if (lVar != null) {
            appendable.append((java.lang.CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof java.lang.CharSequence) {
            appendable.append((java.lang.CharSequence) obj);
        } else if (obj instanceof java.lang.Character) {
            appendable.append(((java.lang.Character) obj).charValue());
        } else {
            appendable.append(java.lang.String.valueOf(obj));
        }
    }
}
