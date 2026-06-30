package cw1;

/* loaded from: classes12.dex */
public final class g implements pm5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f222940a;

    public g(java.util.HashSet hashSet) {
        this.f222940a = hashSet;
    }

    @Override // pm5.d
    public boolean b(java.lang.Object obj) {
        ot1.h hVar = (ot1.h) obj;
        if (!this.f222940a.contains(new jz5.l(hVar.field_username, java.lang.Long.valueOf(hVar.field_msgId)))) {
            return false;
        }
        hVar.field_flags |= 1;
        return false;
    }
}
