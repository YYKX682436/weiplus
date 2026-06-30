package r72;

/* loaded from: classes16.dex */
public abstract class n {
    public static final r45.ev2 a(r72.m finderCollectionItem) {
        kotlin.jvm.internal.o.g(finderCollectionItem, "finderCollectionItem");
        r45.ev2 ev2Var = new r45.ev2();
        ev2Var.set(4, java.lang.Integer.valueOf(finderCollectionItem.getFeedCount()));
        ev2Var.set(5, java.lang.Integer.valueOf(finderCollectionItem.p()));
        ev2Var.set(6, java.lang.Integer.valueOf(finderCollectionItem.q()));
        ev2Var.set(7, java.lang.Integer.valueOf(finderCollectionItem.getPrice()));
        ev2Var.set(1, finderCollectionItem.getTitle());
        ev2Var.set(0, java.lang.Long.valueOf(finderCollectionItem.o()));
        ev2Var.set(3, finderCollectionItem.getThumbUrl());
        ev2Var.set(2, finderCollectionItem.n());
        ev2Var.set(8, finderCollectionItem.k());
        ev2Var.set(9, finderCollectionItem.getNickname());
        ev2Var.set(10, finderCollectionItem.l());
        ev2Var.set(11, finderCollectionItem.j());
        ev2Var.set(12, java.lang.Integer.valueOf(finderCollectionItem.getAuthIconType()));
        ev2Var.set(13, java.lang.Integer.valueOf(finderCollectionItem.r()));
        return ev2Var;
    }

    public static final r72.m b(r45.ev2 originFinderCollection) {
        kotlin.jvm.internal.o.g(originFinderCollection, "originFinderCollection");
        r72.m mVar = new r72.m();
        mVar.A(originFinderCollection.getInteger(4));
        mVar.z(originFinderCollection.getInteger(5));
        mVar.C(originFinderCollection.getInteger(6));
        mVar.E(originFinderCollection.getInteger(7));
        mVar.H(originFinderCollection.getString(1));
        mVar.y(originFinderCollection.getLong(0));
        mVar.G(originFinderCollection.getString(3));
        mVar.x(originFinderCollection.getString(2));
        mVar.u(originFinderCollection.getString(8));
        mVar.B(originFinderCollection.getString(9));
        mVar.w(originFinderCollection.getString(10));
        mVar.t(originFinderCollection.getString(11));
        mVar.s(originFinderCollection.getInteger(12));
        mVar.F(originFinderCollection.getInteger(13));
        return mVar;
    }
}
