package sz4;

/* loaded from: classes12.dex */
public class g extends sz4.a {
    public g(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ked)).setOnClickListener(new sz4.f(this));
    }

    @Override // sz4.a
    public int i() {
        return 30;
    }

    @Override // sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteTextItemHolder", "TextItemHolder position is " + getLayoutPosition());
    }
}
