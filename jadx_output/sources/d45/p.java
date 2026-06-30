package d45;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d45.q f226453d;

    public p(d45.q qVar) {
        this.f226453d = qVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.lang.String str;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        java.util.ArrayList arrayList;
        int i17;
        java.lang.String str2;
        d45.q qVar;
        java.lang.String str3;
        java.lang.String str4;
        boolean z17;
        java.lang.Class cls;
        java.util.ArrayList arrayList2;
        java.lang.String str5;
        boolean z18;
        boolean z19;
        boolean z27;
        boolean z28;
        int i18;
        d45.q qVar2;
        int i19;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z29;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(v17);
        java.lang.Object[] array = arrayList4.toArray();
        arrayList4.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.Object tag = v17.getTag(com.tencent.mm.R.id.f485388hj1);
        kotlin.jvm.internal.o.f(tag, "getTag(...)");
        if (!(tag instanceof java.lang.Integer)) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Number) tag).intValue();
        d45.q qVar3 = this.f226453d;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z37 = qVar3.z(intValue);
        if (z37 == null || com.tencent.mm.sdk.platformtools.t8.K0(z37.f138430e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumAdapter", "[onClick] null == item!");
            qVar3.notifyItemChanged(intValue);
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "click image path:" + z37.f138430e);
        java.util.ArrayList arrayList5 = qVar3.f226458h;
        boolean contains = arrayList5.contains(z37);
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI activity = qVar3.f226454d;
        if (contains) {
            arrayList5.indexOf(z37);
            qVar3.I(z37);
            kotlin.jvm.internal.o.g(activity, "activity");
            ((e45.r) pf5.z.f353948a.a(activity).a(e45.r.class)).f249422i.remove(new com.tencent.mm.pluginsdk.ui.v0(null, z37, null, 5, null));
            d45.d dVar = qVar3.f226464q;
            if (dVar != null) {
                dVar.a(intValue, false);
            }
            str4 = "(Landroid/view/View;)V";
            z27 = false;
            cls = e45.r.class;
            str5 = com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME;
            i17 = intValue;
            z17 = false;
            z28 = true;
            arrayList2 = arrayList5;
            qVar = qVar3;
            str3 = "onClick";
        } else {
            if (t23.p0.k().f415297f == 3 && r26.i0.p(z37.f138438p, "image/gif", true) && !((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().n(z37.f138430e)) {
                j33.d0.o(13459, com.tencent.mm.vfs.w6.k(z37.f138430e) + ",1,,0");
                db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.fjh));
                qVar3.notifyItemChanged(intValue);
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null) && kotlin.jvm.internal.o.b(null, "album_business_byp") && r26.i0.p(z37.f138438p, "image/gif", true) && !((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().s(z37.f138430e)) {
                db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.fin));
                qVar3.notifyItemChanged(intValue);
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            long k17 = com.tencent.mm.vfs.w6.k(z37.f138430e);
            long Ai = ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai();
            if (k17 > Ai) {
                db5.t7.makeText(activity, activity.getString(com.tencent.mm.R.string.cf8, com.tencent.mm.sdk.platformtools.t8.f0(Ai)), 0).show();
                qVar3.notifyItemChanged(intValue);
                ((e35.e) ((e40.x) i95.n0.c(e40.x.class))).Ai(com.tencent.mm.vfs.w6.n(z37.f138430e), k17, 1, z37.r() ? 2 : 1, activity.getIntent().getStringExtra("TO_USER"), z37 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem ? ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) z37).f138446x / 1000 : 0);
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (z37 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                if (t23.p0.k().f415297f == 25) {
                    e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
                    e42.d0 d0Var = e42.d0.clicfg_ultron_album_video_max_select_duration_android;
                    int Ni = ((h62.d) e0Var).Ni(d0Var, 300);
                    jz5.g gVar = qVar3.f226463p;
                    arrayList = arrayList5;
                    int intValue2 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
                    if (Ni < intValue2) {
                        qVar2 = qVar3;
                        Ni = intValue2;
                        i19 = intValue;
                    } else {
                        i19 = intValue;
                        qVar2 = qVar3;
                    }
                    long j17 = Ni;
                    int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(d0Var, 300);
                    int intValue3 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() - 1;
                    if (Ni2 < intValue3) {
                        Ni2 = intValue3;
                    }
                    long j18 = Ni2;
                    com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) z37;
                    str = "MicroMsg.AlbumAdapter";
                    i18 = i19;
                    if (galleryItem$VideoMediaItem.f138446x < d11.s.fj().hj().f71196i * 1000) {
                        db5.e1.G(activity, activity.getResources().getString(com.tencent.mm.R.string.f492194fk5, java.lang.Integer.valueOf(d11.s.fj().hj().f71196i)), "", false, new d45.n(v17));
                        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    int i27 = galleryItem$VideoMediaItem.f138446x;
                    galleryItem$MediaItem = z37;
                    if (i27 > j17 * 1000) {
                        db5.e1.G(activity, activity.getResources().getString(com.tencent.mm.R.string.fk6, java.lang.Long.valueOf(j18)), "", false, new d45.o(v17));
                        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else {
                        str2 = "(Landroid/view/View;)V";
                        str3 = "onClick";
                    }
                } else {
                    i18 = intValue;
                    qVar2 = qVar3;
                    str2 = "(Landroid/view/View;)V";
                    str3 = "onClick";
                    str = "MicroMsg.AlbumAdapter";
                    galleryItem$MediaItem = z37;
                    arrayList = arrayList5;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(null) || !kotlin.jvm.internal.o.b(null, "album_business_bubble_media_by_coordinate")) {
                    i17 = i18;
                    qVar = qVar2;
                } else {
                    int i28 = ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem).f138446x;
                    qVar = qVar2;
                    int i29 = qVar.f226459i;
                    if (i28 >= (i29 * 1000) + 500) {
                        db5.e1.T(activity, activity.getResources().getString(com.tencent.mm.R.string.fk6, java.lang.Integer.valueOf(i29)));
                        qVar.notifyItemChanged(i18);
                        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", str3, str2);
                        return;
                    }
                    i17 = i18;
                }
            } else {
                str = "MicroMsg.AlbumAdapter";
                galleryItem$MediaItem = z37;
                arrayList = arrayList5;
                i17 = intValue;
                str2 = "(Landroid/view/View;)V";
                qVar = qVar3;
                str3 = "onClick";
            }
            if (!activity.g7(galleryItem$MediaItem.f138430e)) {
                com.tencent.mars.xlog.Log.i(str, "choose image check is allowed extensions");
                activity.n7();
                if (v17 instanceof android.widget.CheckBox) {
                    ((android.widget.CheckBox) v17).setChecked(false);
                }
                qVar.notifyItemChanged(i17);
                yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", str3, str2);
                return;
            }
            if (activity.b7() + arrayList.size() < qVar.f226456f) {
                arrayList2 = arrayList;
                arrayList2.add(galleryItem$MediaItem);
                kotlin.jvm.internal.o.g(activity, "activity");
                java.util.ArrayList arrayList6 = ((e45.r) pf5.z.f353948a.a(activity).a(e45.r.class)).f249422i;
                str5 = com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME;
                str4 = str2;
                cls = e45.r.class;
                z17 = false;
                arrayList6.add(new com.tencent.mm.pluginsdk.ui.v0(null, galleryItem$MediaItem, null, 5, null));
                d45.d dVar2 = qVar.f226464q;
                if (dVar2 != null) {
                    dVar2.a(i17, true);
                }
                arrayList2.size();
                z18 = false;
                z19 = false;
            } else {
                str4 = str2;
                z17 = false;
                cls = e45.r.class;
                arrayList2 = arrayList;
                str5 = com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME;
                z18 = true;
                z19 = true;
            }
            qVar.notifyItemChanged(i17);
            z27 = z19;
            z28 = z18;
        }
        if (z27) {
            int i37 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = activity.getString(com.tencent.mm.R.string.cf9, java.lang.Integer.valueOf(qVar.f226456f));
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
        } else {
            d45.c cVar = qVar.f226455e;
            if (cVar != null) {
                int size = arrayList2.size();
                e45.h hVar = ((e45.g) cVar).f249381a;
                d45.q qVar4 = hVar.f249391p;
                if (qVar4 != null && (z29 = qVar4.z(i17)) != null) {
                    int i38 = hVar.f249389n;
                    if (z28) {
                        arrayList3 = null;
                        o23.m.f342426a.c(z29.f138430e, i38, i17);
                        hVar.d(size);
                        hVar.b(i17, z17);
                    } else if (z29.getType() == 1) {
                        o23.m.f342426a.c(z29.f138430e, i38, i17);
                        hVar.d(size);
                        hVar.b(i17, true);
                        arrayList3 = null;
                    } else if (z29.getType() == 2) {
                        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(z29.f138430e);
                        java.lang.String str6 = a17.f213279f;
                        if (str6 != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str6, z17, z17);
                            if (!str6.equals(l17)) {
                                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                            }
                        }
                        arrayList3 = null;
                        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                        boolean F = !m17.a() ? z17 : m17.f213266a.F(m17.f213267b);
                        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = hVar.f249382d;
                        if (F) {
                            z17 = true;
                        } else {
                            db5.e1.W(fileSelectorUI.getContext(), fileSelectorUI.getString(com.tencent.mm.R.string.fjr));
                        }
                        if (z17) {
                            o23.m.f342426a.c(z29.f138430e, i38, i17);
                            hVar.d(size);
                            hVar.b(i17, true);
                        } else {
                            d45.q qVar5 = hVar.f249391p;
                            if (qVar5 != null) {
                                qVar5.I(z29);
                            }
                            kotlin.jvm.internal.o.g(fileSelectorUI, str5);
                            ((e45.r) pf5.z.f353948a.a(fileSelectorUI).a(cls)).f249422i.remove(new com.tencent.mm.pluginsdk.ui.v0(null, z29, null, 5, null));
                        }
                    } else {
                        arrayList3 = null;
                        o23.m.f342426a.c(z29.f138430e, i38, i17);
                        hVar.d(size);
                        hVar.b(i17, true);
                    }
                    d45.q qVar6 = hVar.f249391p;
                    if (!com.tencent.mm.sdk.platformtools.t8.L0(qVar6 != null ? qVar6.E() : arrayList3)) {
                        d45.q qVar7 = hVar.f249391p;
                        java.util.ArrayList E = qVar7 != null ? qVar7.E() : arrayList3;
                        kotlin.jvm.internal.o.d(E);
                        java.util.Iterator it = E.iterator();
                        while (it.hasNext() && com.tencent.mm.sdk.platformtools.y1.c((java.lang.String) it.next())) {
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/adapter/AlbumFileAdapter$selectListener$1", "android/view/View$OnClickListener", str3, str4);
    }
}
