package y53;

/* loaded from: classes8.dex */
public final class f0 implements c01.rb {
    @Override // c01.rb
    public c01.p8 be() {
        return new y53.e0();
    }

    @Override // c01.rb
    public boolean sh(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return com.tencent.mm.storage.z3.Z3(str) || com.tencent.mm.storage.z3.a4(str);
    }
}
