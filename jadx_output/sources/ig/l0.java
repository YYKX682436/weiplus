package ig;

/* loaded from: classes16.dex */
public class l0 extends com.google.protobuf.g {
    @Override // com.google.protobuf.e9
    public java.lang.Object parsePartialFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        ig.m0 newBuilder = ig.n0.newBuilder();
        try {
            newBuilder.mergeFrom(d0Var, t4Var);
            return newBuilder.buildPartial();
        } catch (com.google.protobuf.y6 e17) {
            e17.f45739d = newBuilder.buildPartial();
            throw e17;
        } catch (java.io.IOException e18) {
            com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18.getMessage());
            y6Var.f45739d = newBuilder.buildPartial();
            throw y6Var;
        }
    }
}
